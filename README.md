# 配置Gradle源
Gradle7以上的版本，在project的settings.gradle添加依赖和配置。
```groovy
pluginManagement {
        repositories {
            // 新增 jitpack 源
            maven { url 'https://jitpack.io' }
        }
    }

    dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                 // 新增 jitpack 源
                maven { url 'https://jitpack.io' }
            }
        }
```
Gradle7以下的版本，在project的settings.gradle添加依赖和配置。
```groovy
buildscript {
        repositories {
             // 新增 jitpack 源
            maven { url 'https://jitpack.io' }
        }
    }

    allprojects {
        repositories {
             // 新增 jitpack 源
            maven { url 'https://jitpack.io' }
        }
    }
```
# 根目录 build.gradle 下，添加插件依赖
```groovy
 buildscript {
        dependencies {
            // 新增 core 插件依赖
            classpath "com.github.fmtjava:GradlePluginSample:1.0.2"
        }
    }
```
# 在 app 的 build.gradle 中添加 plugin，可使用以下两种方式
 3.1 plugins 引入方式
 ```groovy
plugins {
            id 'android.heytea.core'
}
```
3.2 apply plugin 引入方式
```groovy
apply plugin: 'android.heytea.core'
```
# 插件配置选项: 添加到app module 的build.gradle文件下 与android {}处于同一级
```groovy
heyteaCore {
    // 是否包含高德定位依赖，默认为true
    includeAMapLocation true
    // 是否包含腾讯 cls 相关依赖，默认为true
    includeCls true
    // 是否包含腾讯 cos 相关依赖，默认为true
    includeCos true
    // 是否包含 guava  相关依赖，默认为true
    includeGuava true
    // 是否包含 阿里 IOT 相关依赖，默认为true
    includeALink true
    // 是否包含 zxing 相关依赖，默认为true
    includeZxing true
    // 是否包含 commons-text 相关依赖，默认为true
    includeCommonsText true
    // 是否包含 commons-compress 相关依赖，默认为true
    includeCommonsCompress true
    // 是否包含 阿里 sls 相关依赖，默认为true
    includeSLS true
}
```
