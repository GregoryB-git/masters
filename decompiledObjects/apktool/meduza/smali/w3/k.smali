.class public final synthetic Lw3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lw3/b$a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lw3/k;->a:Ljava/lang/Object;

    iput-object p2, p0, Lw3/k;->b:Ljava/lang/Object;

    iput-object p3, p0, Lw3/k;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw3/b;

    invoke-interface {p1}, Lw3/b;->p0()V

    return-void
.end method
