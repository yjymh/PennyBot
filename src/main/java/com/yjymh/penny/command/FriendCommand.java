package com.yjymh.penny.command;

import net.mamoe.mirai.contact.Friend;
import net.mamoe.mirai.message.data.Message;
import net.mamoe.mirai.message.data.MessageChain;

import java.util.ArrayList;

/**
 * @author yjymh
 */
public interface FriendCommand extends Command {
    Message execute(Friend sender, ArrayList<String> args, MessageChain messageChain, Friend subject);
}
