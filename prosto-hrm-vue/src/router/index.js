import Vue from "vue";
import Router from "vue-router";

Vue.use(Router);

const routes = [
    {
        path: "/login",
        name: "login",
        component: () => import("@/views/login/index.vue"),
        hidden: true,
    },
];

const router = new Router({
    routes,
});

export default router;
