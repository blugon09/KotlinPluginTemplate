package kr.blugon.kotlinplugintemplate

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class KotlinPluginTemplate : JavaPlugin(), Listener {

    override fun onEnable() {
        logger.info("Plugin Enabled")
    }

    override fun onDisable() {
        logger.info("Plugin Disabled")
    }
}