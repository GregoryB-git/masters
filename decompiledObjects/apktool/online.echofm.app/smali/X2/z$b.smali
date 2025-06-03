.class public abstract LX2/z$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX2/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LX2/Y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, LX2/z;

    .line 2
    .line 3
    const-string v1, "emptySet"

    .line 4
    .line 5
    invoke-static {v0, v1}, LX2/Y;->a(Ljava/lang/Class;Ljava/lang/String;)LX2/Y$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LX2/z$b;->a:LX2/Y$b;

    .line 10
    .line 11
    return-void
.end method
