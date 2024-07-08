LIB ANDROID

Passos para publicar e consumir a Lib:

1 - Configurar build.gradle.kts adicionando função de publishing.

2 - Gerar acess token do git e adicionar hás variavéis de Ambiente junto com variavel de usuário do git.

3 - Rodar comandos em sequencia:
  - ./gradlew build
  - ./gradlew assembleRelease
  - ./gradlew publishToMavenLocal

4 - Gerar Tag de publicação no Git. 
  - Exemplo : git tag 1.0.15
  - 
5 - Com a Lib compilada e commitada, dar push na Tag.
  - Exemplo: git push origin 1.0.15
  - 
6 - Push na branch main
7 - Acessar: jitpack.io e copiar a URL do projeto no git e colar no campo de localização do Jitpack.
  - Exemplo : erikAntunes/LibraryAndroid
  - 
8 - Dar Get it e recuperar a url de implementação dentro da Aplicação que for consumir a Lib. 
  - Exemplo:  implementation 'com.github.erikAntunes:LibraryAndroid:1.0.15

9 - Acessar o build.gradle.kts no projeto ou modulo que irá consumir a lib e adicionar a url de implementação no bloco de dependencias.
  - Exemplo:
  - 
 dependencies {
    implementation("com.github.erikAntunes:LibraryAndroid:1.0.15")
}

10 - Dentro do gradle.settings do projeto que irá consumir a Lib, adicionar a permissão do jitpack.
  - Exemplo:
  - 
  dependencyResolutionManagement {
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
          google()
          mavenCentral()
          maven{ url = uri("https://jitpack.io") }
      }
}

11 - A Lib está pronta para ser consumida.
