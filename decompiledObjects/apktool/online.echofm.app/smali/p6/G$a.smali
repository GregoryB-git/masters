.class public final Lp6/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX5/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic o:Lp6/G$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp6/G$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp6/G$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp6/G$a;->o:Lp6/G$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
