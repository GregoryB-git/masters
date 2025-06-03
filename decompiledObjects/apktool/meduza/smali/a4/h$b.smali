.class public interface abstract La4/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final h:Le0/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/e;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Le0/e;-><init>(I)V

    sput-object v0, La4/h$b;->h:Le0/e;

    return-void
.end method


# virtual methods
.method public abstract release()V
.end method
