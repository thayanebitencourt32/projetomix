import { StyleManagerService } from './style-manager.service';
import { options } from './options';
import { DOCUMENT } from '@angular/common';
import { Inject, Injectable, Renderer2, RendererFactory2 } from '@angular/core';
import { Option } from './option.model';

@Injectable({
  providedIn: 'root',
})
export class SwitchThemeService {
  selectedTheme: Option = options[0];
  private renderer: Renderer2;
  private readonly stylesBasePath = `assets/themes/`;

  constructor(
    @Inject(DOCUMENT) private document: Document,
    rendererFactory: RendererFactory2,
    private readonly styleManager: StyleManagerService
  ) {
    this.renderer = rendererFactory.createRenderer(null, null);
  }

  setTheme() {
    const theme = localStorage.getItem('theme');
    if (theme) {
      this.styleManager.setStyle(`${this.stylesBasePath}${theme}.css`);
      this.updateBodyClass(theme);
    } else {
      this.styleManager.setStyle(`${this.stylesBasePath}saga-blue.css`);
      this.updateBodyClass('saga-blue');
    }
  }

  updateBodyClass(customBodyClass?: string) {
    this.renderer.setAttribute(this.document?.body, 'class', '');
    if (customBodyClass) {
      this.renderer.addClass(this.document?.body, customBodyClass);
    }
  }

  themeChangeHandler(themeToSet: Option) {
    this.selectedTheme = themeToSet;
    this.styleManager.setStyle(`${this.stylesBasePath}${themeToSet.dir}.css`);
    this.updateBodyClass(themeToSet.value);
    localStorage.setItem('theme', themeToSet.value);
  }
}
