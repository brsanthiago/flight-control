export class Aircraft {
  private code: String;
  private name: String;
  private model: String;

  public get $code(): String {
    return this.code;
  }

  public set $code(value: String) {
    this.code = value;
  }

  public get $name(): String {
    return this.name;
  }

  public set $name(value: String) {
    this.name = value;
  }

  public get $model(): String {
    return this.model;
  }

  public set $model(value: String) {
    this.model = value;
  }
}
