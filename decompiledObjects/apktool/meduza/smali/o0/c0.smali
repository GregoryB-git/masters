.class public final Lo0/c0;
.super Lo0/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo0/b0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lo0/c0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/c0;

    invoke-direct {v0}, Lo0/c0;-><init>()V

    sput-object v0, Lo0/c0;->a:Lo0/c0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo0/b0;-><init>()V

    return-void
.end method
