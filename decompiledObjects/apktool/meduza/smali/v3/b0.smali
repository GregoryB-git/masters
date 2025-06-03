.class public final synthetic Lv3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lv3/f1$d;

.field public final synthetic c:Lv3/f1$d;


# direct methods
.method public synthetic constructor <init>(ILv3/f1$d;Lv3/f1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv3/b0;->a:I

    iput-object p2, p0, Lv3/b0;->b:Lv3/f1$d;

    iput-object p3, p0, Lv3/b0;->c:Lv3/f1$d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lv3/b0;->a:I

    iget-object v1, p0, Lv3/b0;->b:Lv3/f1$d;

    iget-object v2, p0, Lv3/b0;->c:Lv3/f1$d;

    check-cast p1, Lv3/f1$c;

    invoke-interface {p1, v0}, Lv3/f1$c;->d(I)V

    invoke-interface {p1, v0, v1, v2}, Lv3/f1$c;->G(ILv3/f1$d;Lv3/f1$d;)V

    return-void
.end method
