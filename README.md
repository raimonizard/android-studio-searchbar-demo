# Android App with SearchBar Composable
## Android Studio Version
Android Studio Ladybug Feature Drop | 2024.2.2

## Language
Kotlin with JetPack Compose

## Purpose
This purpose of the **main** branch is a demo of the use of **SearchBar** Composable.

---

# Gradle dependencies
If you want to expand the current project and include MVVM pattern, which is already in place through the packages, it is necessary to add the following dependencies in the file [`app/build.gradle.kts`](app/build.gradle.kts):

``` bash
dependencies {
    //LIVEDATA
    implementation("androidx.compose.runtime:runtime-livedata:1.6.0")
    //Material 3
    implementation ("androidx.compose.material3:material3:1.2.0-alpha02")
}
```

# Screenshot
## main branch:
<img src="app/screenshot/screenshot_1.png" alt="App activity" width="300"/>
