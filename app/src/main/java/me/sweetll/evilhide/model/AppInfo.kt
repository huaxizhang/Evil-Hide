package me.sweetll.evilhide.model


import android.content.pm.ApplicationInfo

data class AppInfo(var applicationInfo: ApplicationInfo, var hidden: Boolean, var star: Boolean, var password: String)