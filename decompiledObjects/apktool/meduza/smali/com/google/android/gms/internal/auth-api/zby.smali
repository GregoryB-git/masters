.class final Lcom/google/android/gms/internal/auth-api/zby;
.super Lk6/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lm6/a;Ljava/lang/Object;Ll6/c;Ll6/j;)Lk6/a$f;
    .locals 7

    move-object v3, p4

    check-cast v3, Ld6/m;

    new-instance p4, Lcom/google/android/gms/internal/auth-api/zbg;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/auth-api/zbg;-><init>(Landroid/content/Context;Landroid/os/Looper;Ld6/m;Lm6/a;Ll6/c;Ll6/j;)V

    return-object p4
.end method
