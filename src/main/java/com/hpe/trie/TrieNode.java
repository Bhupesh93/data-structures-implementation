package com.hpe.trie;

import java.util.HashMap;

/**
 * Created by Boobesh S on 10/10/2016.

 */
public class TrieNode {
    private char data ;
    private HashMap<Character,TrieNode> children;
    private boolean isEndOfString;

    public TrieNode(char data, boolean isEndOfString) {
        this.data = data;
        this.isEndOfString = isEndOfString;
        children = new HashMap<Character, TrieNode>();
    }

    public TrieNode(char data) {
        this.data = data;
        this.isEndOfString = false;
        children = new HashMap<Character, TrieNode>();
    }

    public char getData() {
        return data;
    }
    public HashMap<Character, TrieNode> getChildren() {
        return children;
    }

    public void setData(char data) {
        this.data = data;
    }

    public boolean isEndOfString() {
        return isEndOfString;
    }

    public void setEndOfString(boolean endOfString) {
        isEndOfString = endOfString;
    }
}
