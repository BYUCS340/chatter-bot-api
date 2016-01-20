package com.google.code.chatterbotapi.test;

import java.util.Scanner;

import com.google.code.chatterbotapi.*;

/*
    chatter-bot-api
    Copyright (C) 2011 pierredavidbelanger@gmail.com
 
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
public class ChatterBotApiTest {
    
    public static void main(String[] args) throws Exception {
        ChatterBotFactory factory = new ChatterBotFactory();

        ChatterBot bot1 = factory.create(ChatterBotType.CLEVERBOT);
        ChatterBotSession bot1session = bot1.createSession();

        ChatterBot bot2 = factory.create(ChatterBotType.PANDORABOTS, "b0dafd24ee35a477");
        ChatterBotSession bot2session = bot2.createSession();

        String yourText = "Hi";
        String s = "";
        Scanner input = new Scanner(System.in);
        while (yourText != "") {

            System.out.print("you> ");
            yourText = input.nextLine();

            s = bot2session.think(yourText);
            System.out.println("PANDORA> " + s);

            s = bot1session.think(yourText);
            System.out.println("CLEVER> " + s);
            
        }
        input.close();
    }
}