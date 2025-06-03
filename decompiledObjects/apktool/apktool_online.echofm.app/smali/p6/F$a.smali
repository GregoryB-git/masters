.class public final Lp6/F$a;
.super LX5/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, LX5/e;->c:LX5/e$b;

    sget-object v1, Lp6/F$a$a;->o:Lp6/F$a$a;

    invoke-direct {p0, v0, v1}, LX5/b;-><init>(LX5/g$c;Lg6/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp6/F$a;-><init>()V

    return-void
.end method
