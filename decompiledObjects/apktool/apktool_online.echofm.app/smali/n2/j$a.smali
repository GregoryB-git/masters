.class public abstract Ln2/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ln2/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln2/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ln2/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln2/j$a;->a:Ln2/j;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a()Ln2/j;
    .locals 1

    .line 1
    sget-object v0, Ln2/j$a;->a:Ln2/j;

    .line 2
    .line 3
    return-object v0
.end method
