import { FlightUiPage } from './app.po';

describe('flight-ui App', () => {
  let page: FlightUiPage;

  beforeEach(() => {
    page = new FlightUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
