.class public final Lr3/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lr3/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/g;

    invoke-direct {v0}, Lr3/g;-><init>()V

    sput-object v0, Lr3/g$a;->a:Lr3/g;

    return-void
.end method
