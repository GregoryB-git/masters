.class public final synthetic Lw3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(ILv3/f1$d;Lv3/f1$d;Lw3/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw3/l;->a:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lw3/l;->a:I

    check-cast p1, Lw3/b;

    invoke-interface {p1}, Lw3/b;->q0()V

    invoke-interface {p1, v0}, Lw3/b;->d(I)V

    return-void
.end method
