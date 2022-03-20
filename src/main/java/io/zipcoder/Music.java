package io.zipcoder;

import java.util.ArrayList;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int clicksDown =0;
        int clicksup =0;
        int loopclicks= 0;
        for(int i = 0; i < playList.length; i++) {
            if (selection.equals(playList[i])) {
                if (startIndex < i) {
                    clicksDown = i - startIndex;

                } else if (i < startIndex) {
                    clicksup = startIndex - i;
                }
            }
            loopclicks = (startIndex) + ((playList.length) - i);
        }
        if (clicksup == loopclicks) {
            return clicksup;
        } else if (clicksDown == loopclicks)
            return clicksDown;
        return loopclicks;
    }


}
