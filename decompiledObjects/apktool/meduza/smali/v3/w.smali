.class public final synthetic Lv3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$b;
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:Lv3/d0;


# direct methods
.method public synthetic constructor <init>(Lv3/d0;)V
    .locals 0

    iput-object p1, p0, Lv3/w;->a:Lv3/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Lv5/h;)V
    .locals 2

    iget-object v0, p0, Lv3/w;->a:Lv3/d0;

    check-cast p1, Lv3/f1$c;

    iget-object v0, v0, Lv3/d0;->f:Lv3/f1;

    new-instance v1, Lv3/f1$b;

    invoke-direct {v1, p2}, Lv3/f1$b;-><init>(Lv5/h;)V

    invoke-interface {p1, v0, v1}, Lv3/f1$c;->e0(Lv3/f1;Lv3/f1$b;)V

    return-void
.end method

.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lv3/w;->a:Lv3/d0;

    check-cast p1, Lv3/f1$c;

    iget-object v0, v0, Lv3/d0;->N:Lv3/f1$a;

    invoke-interface {p1, v0}, Lv3/f1$c;->F(Lv3/f1$a;)V

    return-void
.end method
