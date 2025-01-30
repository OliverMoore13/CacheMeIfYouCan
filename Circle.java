class Circle extends Shape {
    private Integer x;
    private Integer y;
    private float radius;
    private float pi;
    private float area;

    public Circle(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        pi = (float) 3.14;
        area = pi * radius * radius;
    }
}