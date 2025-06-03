.class public final Lc2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Ld2/x;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld2/x;

    invoke-direct {v0}, Ld2/x;-><init>()V

    sput-object v0, Lc2/g$a;->a:Ld2/x;

    return-void
.end method
