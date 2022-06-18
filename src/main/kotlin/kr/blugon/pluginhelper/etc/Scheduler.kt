package kr.blugon.pluginhelper.etc

import org.bukkit.Server
import org.bukkit.plugin.java.JavaPlugin

object Scheduler {
    fun Server.schedulerDelayTask(plugin : JavaPlugin, delay : Long, task : ()->Unit) : Int {
        return this.scheduler.scheduleSyncDelayedTask(plugin, task, delay)
    }

    fun Server.schedulerRepeatingTask(plugin: JavaPlugin, delay : Long, period: Long, task: () -> Unit) : Int {
        return this.scheduler.scheduleSyncRepeatingTask(plugin, task, delay, period)
    }
}