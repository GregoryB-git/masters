.class public abstract Lg2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lp2/a;Lp2/a;Ljava/lang/String;)Lg2/h;
    .locals 1

    .line 1
    new-instance v0, Lg2/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lg2/c;-><init>(Landroid/content/Context;Lp2/a;Lp2/a;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract b()Landroid/content/Context;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Lp2/a;
.end method

.method public abstract e()Lp2/a;
.end method
