package com.longestchain;

public class Chain {
    private int startIndex;
    private int endIndex;
    private int length;
    private int expandedLength;

    public Chain(int startIndex, int endIndex, int length) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.length = length;
    }

    public Chain() {
    }

    public String toString(){
        return "Started @ " + this.startIndex + " and ended @ " + this.endIndex
                + " with length of " + this.length + " that can be expanded till " + this.expandedLength;
    }

    public int getExpandedLength() {
        return expandedLength;
    }

    public void setExpandedLength(int expandedLength) {
        this.expandedLength = expandedLength;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
