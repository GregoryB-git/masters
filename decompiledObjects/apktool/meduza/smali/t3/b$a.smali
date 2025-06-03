.class public final Lt3/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lt3/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt3/b;

    invoke-direct {v0}, Lt3/b;-><init>()V

    sput-object v0, Lt3/b$a;->a:Lt3/b;

    return-void
.end method
