.class public final synthetic Lx0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/a;


# instance fields
.field public final synthetic a:Lx0/y;


# direct methods
.method public synthetic constructor <init>(Lx0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/w;->a:Lx0/y;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lx0/w;->a:Lx0/y;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Lx0/y;->N()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lx0/y;->j(ZLandroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method
