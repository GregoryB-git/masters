.class public final Lrc/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lub/e<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lrc/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrc/n;

    invoke-direct {v0}, Lrc/n;-><init>()V

    sput-object v0, Lrc/n;->a:Lrc/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getContext()Lub/h;
    .locals 1

    sget-object v0, Lub/i;->a:Lub/i;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
