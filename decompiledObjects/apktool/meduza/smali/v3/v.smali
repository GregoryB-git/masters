.class public final synthetic Lv3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lv3/v;->a:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lv3/v;->a:Z

    check-cast p1, Lv3/f1$c;

    invoke-interface {p1, v0}, Lv3/f1$c;->T(Z)V

    return-void
.end method
