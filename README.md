BIBLIOTECA ANDROID COM EXTENSIONS EM GERAL

Passos para publicar e consumir a Lib:

1 - Configurar build.gradle.kts adicionando função de publishing.

2 - Gerar acess token do git e adicionar hás variavéis de Ambiente junto com variavel de usuário do git.

3 - Rodar comandos em sequencia:
  - ./gradlew build
  - ./gradlew assembleRelease
  - ./gradlew publishToMavenLocal

4 - Gerar Tag de publicação no Git. 
  - Exemplo : git tag 0.0.3
  - 
5 - Com a Lib compilada e commitada, dar push na Tag.
  - Exemplo: git push origin 0.0.3
  - 
6 - Push na branch main
7 - Acessar: (https://jitpack.io) e copiar a URL do projeto no git e colar no campo de localização do Jitpack.
  - Exemplo : erikAntunes/LibraryAndroid
  - 
8 - Dar Get it e recuperar a url de implementação dentro da Aplicação que for consumir a Lib. 
  - Exemplo:  implementation 'com.github.erikAntunes:LibraryAndroid:0.0.3

9 - Acessar o build.gradle.kts no projeto ou modulo que irá consumir a lib e adicionar a url de implementação no bloco de dependencias.
  - Exemplo:
  - 
 dependencies {
    implementation("com.github.erikAntunes:LibraryAndroid:0.0.3")
}

10 - Dentro do gradle.settings do projeto que irá consumir a Lib, adicionar a permissão do jitpack.
  - Exemplo:
  - Caso de Lib Pública:
  - 
  dependencyResolutionManagement {

      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    
      repositories {
    
          google()
          mavenCentral()
          maven{ url = uri("https://jitpack.io") }
      }
    
}

- Caso de Lib Privada:

dependencyResolutionManagement {

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    
    repositories {
    
        google()
        mavenCentral()
        maven {
        
            url = uri("https://jitpack.io")
            credentials {
            
                val authToken: String by settings
                username = authToken
                
            }
            
        }
        
    }
    
}

11 - A Lib está pronta para ser consumida.
