package io.zipcoder;

import java.util.ArrayList;
import java.util.TreeSet;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int clicksDown =0;
        int clicksup =0;
        int loopclicks= 0;
        TreeSet<Integer> clicks = new TreeSet<>();
        for(int i = 0; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                if (startIndex < i) {
                    clicksDown = i - startIndex;
                    clicks.add(clicksDown);
                } else if (i < startIndex) {
                    clicksup = startIndex - i;
                    clicks.add(clicksup);
                }
            }
            loopclicks = (startIndex) + ((playList.length) - i);
            clicks.add(loopclicks);
        }

        return clicks.first();
    }


}
