//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InterviewQuestion08 {
   

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("please enter a word");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        List<String> wordsList = new ArrayList();
        String[] var7 = words;
        int var6 = words.length;

        for(int var5 = 0; var5 < var6; ++var5) {
            String w = var7[var5];
            wordsList.add(w.replaceAll("\\W", ""));
        }

        System.out.println(wordsList);
        Map<String, Integer> numOfWords = new HashMap();
        Iterator var10 = wordsList.iterator();

        while(var10.hasNext()) {
            String w = (String)var10.next();
            if (numOfWords.containsKey(w)) {
                numOfWords.put(w, (Integer)numOfWords.get(w) + 1);
            } else {
                numOfWords.put(w, 1);
            }
        }

        System.out.println(numOfWords);
    }
}
