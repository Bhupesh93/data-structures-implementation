package com.hpe.trie;

/**
 * Created by Boobesh S on 10/10/2016.
 */
public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode(' ', false);
    }

    public void insert(String word) {
        TrieNode crawl = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (crawl.getChildren().get(c) == null) {
                TrieNode temp = new TrieNode(c);
                crawl.getChildren().put(c, temp);
                crawl = temp;
            } else
                crawl = crawl.getChildren().get(c);
        }
        crawl.setEndOfString(true);
    }

    public boolean search(String word) {
        TrieNode crawl = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (crawl.getChildren().get(c) == null) return false;
            else {
                crawl = crawl.getChildren().get(c);
            }
        }

        if (crawl.isEndOfString())
            return true;
        else
            return false;
    }

}
