import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ProductDetailComponent} from "./product-detail/product-detail.component";
import {CartComponent} from "./cart/cart.component";
import {OrderComponent} from "./order/order.component";
import {RegisterComponent} from "./register/register.component";
import {HomeComponent} from "./home/home.component";
import {ProductOverviewComponent} from "./product-overview/product-overview.component";
import {UserComponent} from "./user/user.component";
import {AdminComponent} from "./admin/admin.component";


const routes: Routes = [
  {path: 'products', component: ProductOverviewComponent},
  {path: 'cart', component: CartComponent},
  {path: 'products/:id', component: ProductDetailComponent},
  {path: 'checkout', component: OrderComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'user', component: UserComponent},
  {path: 'admin', component: AdminComponent},
  {path: 'home', component: HomeComponent},
  {path: '**', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {relativeLinkResolution: 'legacy'})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
