package com.wenbin.design.principles.lkp;

public class LawOfDemeterTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.commandCheckNumber(teamLeader);
    }
}
