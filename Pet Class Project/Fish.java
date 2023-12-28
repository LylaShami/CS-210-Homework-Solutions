class Fish extends Pet {
    private String scaleColor;

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String speak() {
        return "Bubble, bubble... I am a fish! My scale color is: " + this.scaleColor;
    }
}