.class public abstract Lp2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lp2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp2/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lp2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp2/d$a;->a:Lp2/d;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a()Lp2/d;
    .locals 1

    .line 1
    sget-object v0, Lp2/d$a;->a:Lp2/d;

    .line 2
    .line 3
    return-object v0
.end method
