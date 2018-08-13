/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiworld.api;

import multiworld.command.CommandStack;
import multiworld.command.DebugLevel;
import org.bukkit.command.CommandSender;

/**
 *
 * @author Fernando
 */
public interface CommandStackBuilder
{
	public CommandStack build(CommandSender sender,DebugLevel level);
}
