.class public final Lc2/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Ld2/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld2/a0;

    invoke-direct {v0}, Ld2/a0;-><init>()V

    sput-object v0, Lc2/i$a;->a:Ld2/a0;

    return-void
.end method
