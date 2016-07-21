package com.Ben12345rocks.VotingPlugin.Config;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import com.Ben12345rocks.VotingPlugin.Main;
import com.Ben12345rocks.VotingPlugin.Files.Files;

// TODO: Auto-generated Javadoc
/**
 * The Class Config.
 */
public class Config {

	/** The instance. */
	static Config instance = new Config();

	/** The plugin. */
	static Main plugin = Main.plugin;

	/**
	 * Gets the single instance of Config.
	 *
	 * @return single instance of Config
	 */
	public static Config getInstance() {
		return instance;
	}

	/** The data. */
	FileConfiguration data;

	/** The d file. */
	File dFile;

	/**
	 * Instantiates a new config.
	 */
	private Config() {
	}

	/**
	 * Instantiates a new config.
	 *
	 * @param plugin the plugin
	 */
	public Config(Main plugin) {
		Config.plugin = plugin;
	}

	/**
	 * Allow un joined.
	 *
	 * @return true, if successful
	 */
	public boolean allowUnJoined() {
		return getData().getBoolean("AllowUnjoined");
	}

	/**
	 * Gets the auto create vote sites.
	 *
	 * @return the auto create vote sites
	 */
	public boolean getAutoCreateVoteSites() {
		return getData().getBoolean("AutoCreateVoteSites");
	}

	/**
	 * Gets the background task delay.
	 *
	 * @return the background task delay
	 */
	public int getBackgroundTaskDelay() {
		int num = getData().getInt("BackgroundTaskDelay");
		if (num == 0) {
			num = 600;
		}
		return num;
	}

	/**
	 * Gets the broad cast votes enabled.
	 *
	 * @return the broad cast votes enabled
	 */
	public boolean getBroadCastVotesEnabled() {
		return getData().getBoolean("BroadcastVote");
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public FileConfiguration getData() {
		return data;
	}

	/**
	 * Gets the debug enabled.
	 *
	 * @return the debug enabled
	 */
	public boolean getDebugEnabled() {
		return getData().getBoolean("Debug");
	}

	/**
	 * Gets the effect data.
	 *
	 * @return the effect data
	 */
	public int getEffectData() {
		return getData().getInt("Effect.Data");
	}

	/**
	 * Gets the effect effect.
	 *
	 * @return the effect effect
	 */
	public String getEffectEffect() {
		return getData().getString("Effect.Effect");
	}

	/**
	 * Gets the effect enabled.
	 *
	 * @return the effect enabled
	 */
	public boolean getEffectEnabled() {
		return getData().getBoolean("Effect.Enabled");
	}

	/**
	 * Gets the effect particles.
	 *
	 * @return the effect particles
	 */
	public int getEffectParticles() {
		return getData().getInt("Effect.Particles");
	}

	/**
	 * Gets the effect radius.
	 *
	 * @return the effect radius
	 */
	public int getEffectRadius() {
		return getData().getInt("Effect.Radius");
	}

	/**
	 * Gets the send scoreboards.
	 *
	 * @return the send scoreboards
	 */
	public boolean getSendScoreboards() {
		return getData().getBoolean("SendScoreboards");
	}

	/**
	 * Gets the sound enabled.
	 *
	 * @return the sound enabled
	 */
	public boolean getSoundEnabled() {
		return getData().getBoolean("Sound.Enabled");
	}

	/**
	 * Gets the sound pitch.
	 *
	 * @return the sound pitch
	 */
	public float getSoundPitch() {
		return (float) getData().getDouble("Sound.Pitch");
	}

	/**
	 * Gets the sound sound.
	 *
	 * @return the sound sound
	 */
	public String getSoundSound() {
		return getData().getString("Sound.Sound");
	}

	/**
	 * Gets the sound volume.
	 *
	 * @return the sound volume
	 */
	public float getSoundVolume() {
		return (float) getData().getDouble("Sound.Volume");
	}

	/**
	 * Gets the title enabled.
	 *
	 * @return the title enabled
	 */
	public boolean getTitleEnabled() {
		return getData().getBoolean("Title.Enabled");
	}

	/**
	 * Gets the title fade in.
	 *
	 * @return the title fade in
	 */
	public int getTitleFadeIn() {
		return getData().getInt("Title.FadeIn");
	}

	/**
	 * Gets the title fade out.
	 *
	 * @return the title fade out
	 */
	public int getTitleFadeOut() {
		return getData().getInt("Title.FadeOut");
	}

	/**
	 * Gets the title show time.
	 *
	 * @return the title show time
	 */
	public int getTitleShowTime() {
		return getData().getInt("Title.ShowTime");
	}

	/**
	 * Gets the title sub title.
	 *
	 * @return the title sub title
	 */
	public String getTitleSubTitle() {
		return getData().getString("Title.SubTitle");
	}

	/**
	 * Gets the title title.
	 *
	 * @return the title title
	 */
	public String getTitleTitle() {
		return getData().getString("Title.Title");
	}

	/**
	 * Gets the vote URL default.
	 *
	 * @return the vote URL default
	 */
	public boolean getVoteURLDefault() {
		return getData().getBoolean("VoteURLDefault");
	}

	/**
	 * Reload data.
	 */
	public void reloadData() {
		data = YamlConfiguration.loadConfiguration(dFile);
	}

	/**
	 * Save data.
	 */
	public void saveData() {
		Files.getInstance().editFile(dFile, data);
	}

	/**
	 * Sets the allow un joined.
	 *
	 * @param value the new allow un joined
	 */
	public void setAllowUnJoined(boolean value) {
		getData().set("AllowUnjoined", value);
		saveData();
	}

	/**
	 * Sets the broadcast vote enabled.
	 *
	 * @param value the new broadcast vote enabled
	 */
	public void setBroadcastVoteEnabled(boolean value) {
		getData().set("BroadcastVote", value);
		saveData();
	}

	/**
	 * Sets the debug enabled.
	 *
	 * @param value the new debug enabled
	 */
	public void setDebugEnabled(boolean value) {
		getData().set("Debug", value);
		saveData();
	}

	/**
	 * Sets the top voter awards enabled.
	 *
	 * @param value the new top voter awards enabled
	 */
	public void setTopVoterAwardsEnabled(boolean value) {
		getData().set("TopVoterAwards", value);
		saveData();
	}

	/**
	 * Sets the up.
	 *
	 * @param p the new up
	 */
	public void setup(Plugin p) {
		if (!p.getDataFolder().exists()) {
			p.getDataFolder().mkdir();
		}

		dFile = new File(p.getDataFolder(), "Config.yml");

		if (!dFile.exists()) {
			try {
				dFile.createNewFile();
				plugin.saveResource("Config.yml", true);
			} catch (IOException e) {
				Bukkit.getServer().getLogger()
				.severe(ChatColor.RED + "Could not create Config.yml!");
			}
		}

		data = YamlConfiguration.loadConfiguration(dFile);
	}

}