class AreaPerimeter {
  public static void main(String args[]) {
    float radius = 4.2f;
    float area = radius * radius * (float) Math.PI;
    float peri = 2 * radius * (float) Math.PI;

    System.out.println(String.format("Radius  :: %.3f", radius));
    System.out.println(String.format("Area    :: %.3f", area));
    System.out.println(String.format("Peri    :: %.3f", peri));

  };
};
