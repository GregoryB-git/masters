.class public final Lo6/b;
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

    move-object v4, p4

    check-cast v4, Lm6/n;

    new-instance p4, Lo6/d;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lo6/d;-><init>(Landroid/content/Context;Landroid/os/Looper;Lm6/a;Lm6/n;Ll6/c;Ll6/j;)V

    return-object p4
.end method
