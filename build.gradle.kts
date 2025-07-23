plugins {
  `maven-publish`
}

group = "dev.polkabind"
// version is picked up from the Git tag by JitPack

publishing {
  publications {
    create<MavenPublication>("aar") {
      artifactId = "polkabind-android"
      // point at the prebuilt AAR in this zip
      artifact("$projectDir/aar/polkabind-android-release.aar")
    }
  }
}
