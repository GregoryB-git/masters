.class public abstract Lp6/g0;
.super Lp6/F;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/g0$a;
    }
.end annotation


# static fields
.field public static final q:Lp6/g0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp6/g0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lp6/g0$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp6/g0;->q:Lp6/g0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/F;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
