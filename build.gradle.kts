plugins {
  `maven-publish`
}

group = "com.github.Polkabind"
// version is picked up from the Git tag by JitPack

publishing {
  publications {
    create<MavenPublication>("aar") {
      artifactId = "polkabind-kotlin-pkg"
      // point at the prebuilt AAR in this zip
      artifact("$projectDir/aar/polkabind-android-release.aar")
    }
  }
}
