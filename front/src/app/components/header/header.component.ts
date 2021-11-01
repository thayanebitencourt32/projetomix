import { Component, OnInit } from '@angular/core';
import { SwitchThemeService } from 'src/app/switch-theme.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
})
export class HeaderComponent implements OnInit {
  constructor(private readonly themeService: SwitchThemeService) {}

  ngOnInit(): void {
    this.themeService.setTheme();
  }
}
