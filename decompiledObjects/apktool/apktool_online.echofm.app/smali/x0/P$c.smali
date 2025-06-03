.class public final Lx0/P$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ld0/q;

.field public final b:Lp0/x$b;


# direct methods
.method public constructor <init>(Ld0/q;Lp0/x$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/P$c;->a:Ld0/q;

    iput-object p2, p0, Lx0/P$c;->b:Lp0/x$b;

    return-void
.end method

.method public synthetic constructor <init>(Ld0/q;Lp0/x$b;Lx0/P$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lx0/P$c;-><init>(Ld0/q;Lp0/x$b;)V

    return-void
.end method
