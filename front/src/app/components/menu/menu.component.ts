import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { Option } from 'src/app/option.model';
import { SwitchThemeService } from 'src/app/switch-theme.service';
import { options } from './../../options';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss'],
})
export class MenuComponent implements OnInit {
  items: MenuItem[] = [];

  constructor(private readonly themeService: SwitchThemeService) {}

  ngOnInit(): void {
    this.addItemsToMenu();
  }

  private addItemsToMenu() {
    const items: MenuItem[] = [];
    options.forEach(option => {
      const item: MenuItem = {
        label: option.label,
        icon: option.icon,
        command: event => {
          this.changeTheme(option);
        },
      };
      items.push(item);
    });
    this.items = [
      {
        label: 'Themes',
        items: items,
      },
    ];
  }

  changeTheme(themeToSet: Option) {
    this.themeService.themeChangeHandler(themeToSet);
  }
}
