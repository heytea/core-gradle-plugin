package android.heytea.core.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HeyteaCorePlugin : Plugin<Project> {
    override fun apply(project: Project) {

        project.extensions.create("heyteaCore", HeyteaCoreExtension::class.java)

        project.afterEvaluate {
            val extension = project.extensions.findByName("heyteaCore") as? HeyteaCoreExtension
            extension?.let {
                if (extension.includeCls) {
                    project.dependencies.add("implementation", "com.tencentcloudapi.cls:tencentcloud-cls-sdk-android:1.0.10")
                    project.dependencies.add("implementation", "com.tencentcloudapi.cls:cls-network-diagnosis-reporter-android:1.0.10")
                }
                if (extension.includeCos) {
                    project.dependencies.add("implementation", "com.qcloud.cos:cos-android:5.9.+")
                }
                if (extension.includeALink) {
                    project.dependencies.add("implementation", "com.aliyun.alink.linksdk:lp-iot-linkkit:1.7.3.1")
                }
                if (extension.includeGuava) {
                    project.dependencies.add("implementation", "com.google.guava:guava:31.0.1-android")
                }
                if (extension.includeAMapLocation) {
                    project.dependencies.add("implementation", "com.amap.api:location:4.9.0")
                }
                if (extension.includeZxing) {
                    project.dependencies.add("implementation", "com.google.zxing:core:3.5.1")
                }
                if (extension.includeCommonsText) {
                    project.dependencies.add("implementation", "org.apache.commons:commons-text:1.9")
                }
                if (extension.includeCommonsCompress) {
                    project.dependencies.add("implementation", "org.apache.commons:commons-compress:1.20")
                }
                if (extension.includeSLS) {
                    project.dependencies.add("implementation", "com.aliyun.openservices:aliyun-log-android-sdk:2.6.9@aar")
                }
            }
        }
    }
}