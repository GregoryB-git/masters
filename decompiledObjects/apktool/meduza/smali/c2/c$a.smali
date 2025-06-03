.class public final Lc2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Ld2/u;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld2/u;

    invoke-direct {v0}, Ld2/u;-><init>()V

    sput-object v0, Lc2/c$a;->a:Ld2/u;

    return-void
.end method
