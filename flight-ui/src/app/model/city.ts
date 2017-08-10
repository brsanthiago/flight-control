export class City {
  private name: String;
  private country: String;


  public get $name(): String {
    return this.name;
  }

  public set $name(value: String) {
    this.name = value;
  }

  public get $country(): String {
    return this.country;
  }

  public set $country(value: String) {
    this.country = value;
  }
}
